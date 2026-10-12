import cloudsmith_api


def test_patch_request_sends_only_the_fields_that_are_set():
    patch = cloudsmith_api.RepositoryRequestPatch(description="A new description")

    assert patch.to_dict() == {"description": "A new description"}
