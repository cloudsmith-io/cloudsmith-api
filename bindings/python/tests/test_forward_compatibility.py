import cloudsmith_api


def test_unknown_enum_value_in_response_deserializes():
    repository = cloudsmith_api.Repository.from_dict(
        {"name": "my-repo", "broadcast_state": "A value added after this release"}
    )

    assert repository.broadcast_state == "A value added after this release"


def test_response_that_breaks_spec_constraints_deserializes():
    audit_log = cloudsmith_api.NamespaceAuditLog.from_dict(
        {"actor": None, "actor_location": None, "context": "", "event": "action.login"}
    )

    assert audit_log.actor_location is None
    assert audit_log.context == ""
