import cloudsmith_api


def test_unknown_enum_value_in_response_deserializes():
    repository = cloudsmith_api.Repository.from_dict(
        {"name": "my-repo", "broadcast_state": "A value added after this release"}
    )

    assert repository.broadcast_state == "A value added after this release"
